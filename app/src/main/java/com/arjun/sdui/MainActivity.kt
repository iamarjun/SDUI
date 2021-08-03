package com.arjun.sdui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.arjun.sdui.data.model.SectionX
import com.arjun.sdui.ui.components.CardComponent
import com.arjun.sdui.ui.components.FilterComponent
import com.arjun.sdui.ui.components.InfoComponent
import com.arjun.sdui.ui.components.NavComponent
import com.arjun.sdui.ui.theme.SDUITheme
import com.arjun.sdui.ui.viewmodel.ChoiceViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SDUITheme {
                val viewModel = viewModel<ChoiceViewModel>()
                val state by viewModel.response.collectAsState()
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = {
                            NavComponent()
                        }
                    ) {
                        val modifier = Modifier.padding(it)
                        LazyColumn(
                            modifier = modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            state.layout?.body?.sectionDetails?.forEach { sectionDetail ->
                                sectionDetail.sectionId?.let { sectionId ->
                                    val data = state.sections?.find { it.id == sectionId }?.section
                                    data?.let { sectionData ->
                                        item {
                                            GetComponent(
                                                modifier = modifier,
                                                component = sectionId,
                                                data = sectionData
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

@Composable
fun GetComponent(modifier: Modifier, component: String, data: SectionX) {
    when (component) {
        "navigation" -> TopAppBar(modifier = modifier, data = data)
        "info" -> Info(modifier = modifier, data = data)
        "filters" -> Filters(modifier = modifier, data = data)
        "12345" -> Card1(modifier = modifier, data = data)
        "23456" -> Card1(modifier = modifier, data = data)
    }
}

@Composable
fun TopAppBar(modifier: Modifier, data: SectionX) {

}

@Composable
fun Info(modifier: Modifier, data: SectionX) {
    InfoComponent(modifier = modifier, data = data)
}

@Composable
fun Filters(modifier: Modifier, data: SectionX) {
    FilterComponent(modifier = modifier, data = data)
}

@Composable
fun Card1(modifier: Modifier, data: SectionX) {
    CardComponent(modifier = modifier, data = data)
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SDUITheme {
        Greeting("Android")
    }
}






