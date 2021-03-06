package com.hly.utils.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(setLayoutResourceID(), container, false);
        ButterKnife.bind(this, rootView);
        setUpView();
        return rootView;
    }

    protected abstract int setLayoutResourceID();

    protected abstract void setUpView();
}
