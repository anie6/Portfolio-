package edu.towson.cosc435.williams.tictactoe.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoardBase(){
Canvas(modifier = Modifier
    .size(300.dp)
    .padding(10.dp),
     ){
//first vertical line
    drawLine(
        color = Color.Gray,
        strokeWidth = 5f,
        cap = StrokeCap.Round,
        start = Offset(x = size.width*1/3, y = 0f),
        end = Offset(x = size.width*1/3, y = size.height)
    )
    //second vertical line

    drawLine(
        color = Color.Gray,
        strokeWidth = 5f,
        cap = StrokeCap.Round,
        start = Offset(x = size.width*2/3, y = 0f),
        end = Offset(x = size.width*2/3, y = size.height)
    )
    //first horitzonal line
    drawLine(
        color = Color.Gray,
        strokeWidth = 5f,
        cap = StrokeCap.Round,
        start = Offset(x = 0f, y = size.height*1/3),
        end = Offset(x = size.width, y = size.height*1/3)
    )
    //second horizontal line
    drawLine(
        color = Color.Gray,
        strokeWidth = 5f,
        cap = StrokeCap.Round,
        start = Offset(x = 0f, y = size.height*2/3),
        end = Offset(x = size.width, y = size.height*2/3)
    )
  }
}

@Composable
fun Cross(){
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ){
    drawLine(
        color = GreenishYellow,
        strokeWidth = 20f,
        cap = StrokeCap.Round,
        start = Offset(x = 0f, y = 0f),
        end = Offset(x = size.width, y = size.height)
    )
        drawLine(
            color = GreenishYellow,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

@Composable
fun Circle(){
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ){
        drawCircle(
            color = Aqua,
            style = Stroke(width = 20f)
        )
    }
}


//create 8 winning lines
@Composable
fun WinHoriLines1(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/6),
            end = Offset(x = size.width, y = size.height*1/6)
        )
    }
}

@Composable
fun WinHoriLines2(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*3/6),
            end = Offset(x = size.width, y = size.height*3/6)
        )
    }
}

@Composable
fun WinHoriLines3(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*5/6),
            end = Offset(x = size.width, y = size.height*5/6)
        )
    }
}

//vertical lines
@Composable
fun WinVertiLines1(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/6, y = 0f),
            end = Offset(x = size.width*1/6, y = size.height)
        )
    }
}

@Composable
fun WinVertiLines2(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*3/6, y = 0f),
            end = Offset(x = size.width*3/6, y = size.height)
        )
    }
}

@Composable
fun WinVertiLines3(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*5/6, y = 0f),
            end = Offset(x = size.width*5/6, y = size.height)
        )
    }
}

//Diagonal Lines (2)
@Composable
fun WinDiagLines1(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )
    }
}

@Composable
fun WinDiagLines2(){
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = Color.Red,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

@Preview
@Composable
fun Pre(){
    WinDiagLines1()
    WinDiagLines2()
    WinVertiLines1()
    WinVertiLines2()
    WinVertiLines3()
    WinHoriLines1()
    WinHoriLines2()
    WinHoriLines3()
    //Circle()
 //   CrossProcessCursor()
    BoardBase()
}
