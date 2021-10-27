package com.rafsan.jetpackcomposebasics.uiComponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.rafsan.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme
import com.rafsan.jetpackcomposebasics.ui.theme.Teal700

class TopBarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                JetpackComposeBasicsTheme {
                    DrawTopBar()
                }
            }
        }
    }
}

@Composable
private fun DrawTopBar() {
    TopAppBar(
        backgroundColor = Teal700,
        contentColor = Color.White,
        modifier = Modifier.padding(5.dp),
        title = { Text("Simple TopAppBar") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Menu, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Default.Search, contentDescription = "Localized description")
            }
        }
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun AppBarPreview() {
    JetpackComposeBasicsTheme {
        DrawTopBar()
    }
}