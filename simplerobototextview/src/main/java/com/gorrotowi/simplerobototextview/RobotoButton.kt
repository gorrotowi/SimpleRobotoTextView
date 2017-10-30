package com.gorrotowi.simplerobototextview

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : Button(context, attrs) {

    init {
        if (!isInEditMode) {
            RobotoFontManager(context).initStyle(this, attrs)
        }
    }
}