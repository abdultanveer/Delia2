package com.abdul.delia2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsFragment extends Fragment {
TextView newsTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View newsFrag = inflater.inflate(R.layout.fragment_news,container,false);
        newsTextView = newsFrag.findViewById(R.id.tvNews);
         return newsFrag;
    }

    public void updateTextview(String headline) {
        newsTextView.setText(headline);
    }
}
