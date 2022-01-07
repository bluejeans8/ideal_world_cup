package com.example.tournament;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class tournament_winner extends Fragment {

    Context context;
    ArrayList<Integer> BitImages;
    private ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.tournament_winner,container, false);
        context = getContext();
        image = root.findViewById(R.id.imageView);

        BitImages = getArguments().getIntegerArrayList("BitImages");

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), BitImages.get(0));
        image.setImageBitmap(bitmap);

        return root;
    }
}