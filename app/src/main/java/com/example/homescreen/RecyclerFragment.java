package com.example.homescreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerFragment extends Fragment {
    public static Fragment newInstance() {
        return new RecyclerFragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_review_fragment,container,false);

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("One");
        list.add("Two");
        list.add("One");
        list.add("Two");







        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(new RecyclerViewAdapter(list));


        return view;
    }
    private class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private CardView mCardview1;
        private TextView mTextview;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
        }
        public RecyclerViewHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.card_view,container,false));
            mCardview1 = itemView.findViewById(R.id.card_container);
            mTextview = itemView.findViewById(R.id.textholder);


        }
    }
    private class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {
        private List<String> mList;

        public RecyclerViewAdapter(List<String> list){
            this.mList = list;


        }


        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater1 = LayoutInflater.from(getActivity());
            return new RecyclerViewHolder(inflater1,parent);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

            holder.mTextview.setText(mList.get(position));

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }
    }


}
