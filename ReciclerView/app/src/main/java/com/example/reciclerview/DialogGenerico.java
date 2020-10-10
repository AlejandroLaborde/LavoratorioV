package com.example.reciclerview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogGenerico extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Alert Personalizado");
        builder.setMessage("Mensaje en el alert");
        onClickListenerDialog asd = new onClickListenerDialog();
        builder.setNeutralButton("Neutral",asd);
        builder.setPositiveButton("Positive",asd);
        builder.setNegativeButton("Negative",asd);
        return builder.create();

        /*
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(this.titulo);
        View dialogPersonalizado = LayoutInflater.from(getActivity()).inflate(R.layout.dialog,null);
        builder.setView(dialogPersonalizado);
        return builder.create();
        * */
    }
}
