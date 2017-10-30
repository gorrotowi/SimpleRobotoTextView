package com.gorrotowi.simplerobototextview

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

/**
 * @author gorrotowi on 25/03/16.
 */
class RobotoTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : TextView(context, attrs) {

    init {
        if (!isInEditMode) {
            RobotoFontManager(context).initStyle(this, attrs)
        }
    }
}