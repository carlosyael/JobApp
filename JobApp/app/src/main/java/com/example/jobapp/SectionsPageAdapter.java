package com.example.jobapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SectionsPageAdapter extends FragmentStateAdapter {
    public SectionsPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                Liquidacion tab1obj=new Liquidacion();
                return tab1obj;
            case 1:
                Retenciones tab2obj=new Retenciones();
                return tab2obj;

            case 2:
                Regalias tab3obj=new Regalias();
                return tab3obj;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
