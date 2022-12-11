package com.example.jetheroes.ui.stateholder

import android.app.ProgressDialog.show
import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import com.example.jetheroes.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class StateHolder(
    private val scope: CoroutineScope,
    private val context: Context
) {

    fun onItemSelected(title: String) {
        scope.launch {
            Toast.makeText(
                context,
                 title,
                Toast.LENGTH_SHORT
            )
                .show()
        }
    }
}

//composeStateHolder
@Composable
fun rememberStateHolder(
    scope: CoroutineScope = rememberCoroutineScope(),
    context: Context = LocalContext.current
): StateHolder = remember(scope, context) {
    StateHolder(scope, context)
}