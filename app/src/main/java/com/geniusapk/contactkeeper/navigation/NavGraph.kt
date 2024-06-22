package com.geniusapk.contactkeeper.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.geniusapk.contactkeeper.presentation.ContactViewModel
import com.geniusapk.contactkeeper.presentation.Screens.AddEditScreen
import com.geniusapk.contactkeeper.presentation.Screens.HomeScreen


@Composable
fun NavGraph(navHostController: NavHostController, viewModel: ContactViewModel) {

    val state by viewModel.state.collectAsState()
    NavHost(navController = navHostController, startDestination = Routes.Home.route) {
        composable(Routes.AddEdit.route) {
            AddEditScreen(
                navHostController = navHostController,
                state = viewModel.state.collectAsState().value,
                onEvent = { viewModel.saveContact() })
        }
        composable(Routes.Home.route) {
            HomeScreen(
                navHostController = navHostController,
                state = state,
                viewModel = viewModel
            )
        }

    }
}


