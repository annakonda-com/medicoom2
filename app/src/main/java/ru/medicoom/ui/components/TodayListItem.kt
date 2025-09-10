package ru.medicoom.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.medicoom.R

//time: String, title: String, description: String, done: Boolean

@Preview
@Composable
fun TodayListItem(){
    val time = "4:30"
    val title = "Парацетамол"
    val description = "2 таблетки до еды"
    val done = true
    Row(modifier = Modifier.background(MaterialTheme.colorScheme.surfaceContainerLowest,
        RoundedCornerShape(18.dp)).padding(12.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Column {
            Text(time, style = MaterialTheme.typography.labelLarge)
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Text(description, style = MaterialTheme.typography.titleSmall)
        }
        Icon(painter = painterResource(R.drawable.outline_circle_24), title)
    }
}