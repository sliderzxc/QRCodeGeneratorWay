package com.main.generation_from_link.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.main.core.base.BaseViewModelFactory
import com.main.generation_from_link.domain.dialog.ManageGeneratedDialogFromLink
import com.main.generation_from_link.domain.usecase.GenerationFromLinkUseCase
import com.main.generation_from_link.presentation.communication.GenerationFromLinkCommunication

class GenerationFromLinkViewModelFactory(
    private val generationFromLinkUseCase: GenerationFromLinkUseCase,
    private val generationFromLinkCommunication: GenerationFromLinkCommunication,
    private val manageGeneratedDialogFromLink: ManageGeneratedDialogFromLink
) : BaseViewModelFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GenerationFromLinkViewModel(
            generationFromLinkUseCase = generationFromLinkUseCase,
            generationFromLinkCommunication = generationFromLinkCommunication,
            manageGeneratedDialogFromLink = manageGeneratedDialogFromLink
        ) as T
    }
}