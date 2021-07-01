package com.example.listacontatos

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runner.manipulation.Ordering
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class ContactHelperTest {

    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val sharedPreferences =
        context.getSharedPreferences("br.com.bootcampkotlin.PREFERENCES", Context.MODE_PRIVATE)

    private val contactHelper = ContactHelper(sharedPreferences)

    @Test
    fun `Quando chamar o metodo getListContacts com 2 contatos, deve retornar uma lista de 2 contatos`() {
        // Cenario
        mockListaDoisContatos()

        // Assertivas
        val list = contactHelper.getLisContacts()
        assertEquals(2, list.size)
    }

    @Test
    fun `Quando chamar o metodo getListContacts() sem contatos, deve retornar uma lista vazia`() {
        mockListaContatosVazia()

        val list = contactHelper.getLisContacts()
        assertEquals(0, list.size)
    }

    private fun mockListaDoisContatos() {
        contactHelper.setListContacts(
            arrayListOf(
                Contact(
                    "João da Silva",
                    "(00)98888-7777",
                    "img.jpg"
                ),
                Contact(
                    "Maria de Souza",
                    "(00)97777-6666",
                    "img2.jpg"
                )
            )
        )
    }

    private fun mockListaContatosVazia() {
        contactHelper.setListContacts(arrayListOf())
    }
}