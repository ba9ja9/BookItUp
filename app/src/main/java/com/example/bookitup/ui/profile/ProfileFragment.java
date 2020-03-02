package com.example.bookitup.ui.profile;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.textfield.TextInputEditText;

import com.example.bookitup.R;

public class ProfileFragment extends Fragment {
    private ProfileViewModel profileViewModel;
    private TextView forgotPassword;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_edit_profile, container, false);

    }

}