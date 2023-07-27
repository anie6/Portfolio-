package edu.towson.cosc435.williams.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.towson.cosc435.williams.tictactoe.ui.theme.GameScreen
import edu.towson.cosc435.williams.tictactoe.ui.theme.GameViewModel
import edu.towson.cosc435.williams.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                val viewModel = viewModel<GameViewModel>()
            GameScreen(
                viewModel = viewModel
            )
            }
        }
    }
}

