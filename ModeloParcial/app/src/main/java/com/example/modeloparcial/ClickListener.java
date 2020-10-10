package com.example.modeloparcial;

import android.util.Log;
import android.view.View;

public class ClickListener implements View.OnClickListener{

    private MainActivity activity;
    private  Integer p;
    private ProductoViewHolder vh;

    public ClickListener( MainActivity  activity , ProductoViewHolder vh) {
        this.activity = activity;
        this.vh = vh;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.moreButton:
                Log.d("asd","MORE");

                this.activity.controlStock("+", this.vh.indice);

                break;
            case R.id.lessButton:
                Log.d("asd","LESS");
                this.activity.controlStock("-",this.vh.indice);

                break;
            case R.id.editButton:
                Log.d("asd","EDIT");
                this.activity.controlStock("E", this.vh.indice);

                break;
        }

    }
}
