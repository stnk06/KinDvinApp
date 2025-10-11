package com.example.kindvinapp.adapters;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.kindvinapp.R;
import com.example.kindvinapp.models.Team;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

public class TeamEditorAdapter extends RecyclerView.Adapter<TeamEditorAdapter.ViewHolder> {
    private final ArrayList<Team> teamList;
    private OnRemoveClickListener removeClickListener;

    public interface OnRemoveClickListener {
        void onRemoveClick(int position);
    }

    public void setOnRemoveClickListener(OnRemoveClickListener listener) {
        this.removeClickListener = listener;
    }

    public TeamEditorAdapter(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_editor_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (holder.textWatcher != null) {
            holder.teamNameEditText.removeTextChangedListener(holder.textWatcher);
        }

        Team team = teamList.get(position);
        holder.teamNameEditText.setText(team.getName());
        holder.container.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), team.getColorResId()));

        holder.textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    teamList.get(currentPosition).setName(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };
        holder.teamNameEditText.addTextChangedListener(holder.textWatcher);


        holder.removeButton.setOnClickListener(v -> {
            if (removeClickListener != null && holder.getAdapterPosition() != RecyclerView.NO_POSITION) {
                removeClickListener.onRemoveClick(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextInputEditText teamNameEditText;
        MaterialButton removeButton;
        LinearLayout container;
        TextWatcher textWatcher;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            teamNameEditText = itemView.findViewById(R.id.team_name_edit_text);
            removeButton = itemView.findViewById(R.id.remove_team_button);
            container = itemView.findViewById(R.id.team_item_container);
        }
    }
}