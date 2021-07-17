package com.abdul.delia2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView headlineListView;
    onHeadlineClickListener onHeadlineClickListener; //declaration

    interface  onHeadlineClickListener{ //defination
       void onHeadlineClick(String headline);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        onHeadlineClickListener = (HeadlinesFragment.onHeadlineClickListener) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View fragmentLayout = inflater.inflate(R.layout.fragment_headlines,container,false);
         headlineListView = fragmentLayout.findViewById(R.id.headlinesListview);
         headlineListView.setOnItemClickListener(this);
         return fragmentLayout;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        //Toast.makeText(getContext(),adapterView.getItemAtPosition(position).toString() , Toast.LENGTH_SHORT).show();
        onHeadlineClickListener.onHeadlineClick(adapterView.getItemAtPosition(position).toString());
    }
}
