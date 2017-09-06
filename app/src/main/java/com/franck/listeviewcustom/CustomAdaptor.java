package com.franck.listeviewcustom;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by franck on 06/09/2017.
 */

public class CustomAdaptor extends ArrayAdapter{


    public CustomAdaptor(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public CustomAdaptor(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
}
