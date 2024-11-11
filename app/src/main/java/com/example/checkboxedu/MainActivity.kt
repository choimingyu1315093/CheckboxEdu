package com.example.checkboxedu

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.example.checkboxedu.ui.theme.CheckboxEduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CheckboxEduTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun BasicCheckbox(modifier: Modifier = Modifier){
    var isChecked by remember { mutableStateOf(false) }

    Checkbox(
        checked = isChecked,
        onCheckedChange = { isChecked = it},
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Green,
            uncheckedColor = Color.Red,
            checkmarkColor = Color.Blue,
        )
    )
}

@Composable
fun BasicRowCheckbox(modifier: Modifier = Modifier){
    var isChecked by remember { mutableStateOf(false) }

    Row (
        verticalAlignment = Alignment.CenterVertically
    ){
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it},
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Green,
                uncheckedColor = Color.Red,
                checkmarkColor = Color.Blue,
            )
        )
        Text(
            text = "개인정보처리동의"
        )
    }
}