package ru.noties.scrollable.sample;


import androidx.fragment.app.FragmentActivity;

public class BaseActivity extends FragmentActivity {

    protected <V> V findView(int id) {
        //noinspection unchecked
        return (V) findViewById(id);
    }
}
