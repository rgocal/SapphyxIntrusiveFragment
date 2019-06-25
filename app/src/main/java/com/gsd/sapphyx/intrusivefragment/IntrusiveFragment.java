package com.gsd.sapphyx.intrusivefragment;

import android.app.Fragment;
import android.os.Bundle;

public abstract class IntrusiveFragment extends Fragment {

    public static final String ARG_POSITION = "arg_position";

    /**
     * Get a new instance of the fragment for the pages adapter. Accessed via reflection.
     *
     * @param position the position in the adapter
     * @return the fragment to display.
     */
    public final IntrusiveFragment getFragment(int position) {
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        IntrusiveFragment page = getNewInstance();
        page.setArguments(args);
        return page;
    }

    /**
     * New-up an instance of the subclass.
     */
    public abstract IntrusiveFragment getNewInstance();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
}
