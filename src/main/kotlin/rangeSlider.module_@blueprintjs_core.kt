@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import global.JSX.Element

external interface IRangeSliderProps : ISliderBaseProps {
    var value: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((value: dynamic /* JsTuple<Number, Number> */) -> Unit)?
    val onRelease: ((value: dynamic /* JsTuple<Number, Number> */) -> Unit)?
}

external open class RangeSlider(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IRangeSliderProps> {
    override fun render(): Element
    override fun validateProps(props: IRangeSliderProps)

    companion object {
        var defaultProps: IRangeSliderProps
        var displayName: String
    }
}