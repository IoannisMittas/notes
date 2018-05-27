package com.mittas.notes.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mittas.notes.R;


public class DetailFragment extends Fragment {
    public static final String TAG = "DETAIL_FRAGMENT";
    private static final String ARG_NOTE_ID = "NOTE_ID";
    private String noteId;

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        this.noteId = args.getString(ARG_NOTE_ID, "Wrong note id in " + TAG);
    }

    public static DetailFragment newInstance(String noteId) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NOTE_ID, noteId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

//        final ImageView imageView = rootView.findViewById(R.id.imageview);
//
//        if (imageUri != null) {
//            Glide.with(getActivity()).load(imageUri).thumbnail(0.1f).into(imageView);
//        }

        return rootView;
    }

}
