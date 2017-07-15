package com.example.marcin.projektpodsumowujacy;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class ListOfFiguresViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;

    public ListOfFiguresViewHolder(final View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.figureImage);
        textView = (TextView) itemView.findViewById(R.id.figureTextView);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setImageView(final ImageView imageView) {
        this.imageView = imageView;
    }

    public void setTextView(final TextView textView) {
        this.textView = textView;
    }
}
