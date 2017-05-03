import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.HTMLInputElement
import kotlin.browser.document

/**
 * Created by lynas on 5/3/2017..
 */

fun main(args: Array<String>) {
    println("Hello JavaScript!")
    val button = document.getElementById("button1") as? HTMLButtonElement
    val buttonText = button?.innerText
    button?.onclick = {
        e-> e.preventDefault()
        console.log(e)
        console.log(buttonText)
        console.log("printing")
        println("println")

    }

    val form = document.getElementById("form1") as? HTMLFormElement
    val text1 = document.getElementById("text1") as? HTMLInputElement
    val text2 = document.getElementById("text2") as? HTMLInputElement

    form?.onsubmit = {
        event -> event.preventDefault()
        console.log("form submitting")
        console.log(text1?.value)
        console.log(text2?.value)
    }



}

