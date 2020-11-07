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

external interface INumericInputProps : IIntentProps, IProps {
    var allowNumericCharactersOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var buttonPosition: dynamic /* Any? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var clampValueOnBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((ref: HTMLInputElement?) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var majorStepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minorStepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: Element?
        get() = definedExternally
        set(value) = definedExternally
    var selectAllOnFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectAllOnIncrement: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    val onButtonClick: ((valueAsNumber: Number, valueAsString: String) -> Unit)?
    val onValueChange: ((valueAsNumber: Number, valueAsString: String, inputElement: HTMLInputElement?) -> Unit)?
}

external interface INumericInputState {
    var currentImeInputInvalid: Boolean
    var prevMinProp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var prevMaxProp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shouldSelectAfterUpdate: Boolean
    var stepMaxPrecision: Number
    var value: String
}

external interface `T$28` {
    var stepMaxPrecision: Number
    var value: String
    var prevMaxProp: Number?
    var prevMinProp: Number?
}

external open class NumericInput(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<HTMLInputProps /* HTMLInputProps & INumericInputProps */, INumericInputState> {
    open var didPasteEventJustOccur: Any
    open var delta: Any
    open var inputElement: Any
    open var intervalId: Any
    open var incrementButtonHandlers: Any
    open var decrementButtonHandlers: Any
    override fun render(): Element
    open fun componentDidUpdate(prevProps: INumericInputProps, prevState: INumericInputState)
    override fun validateProps(nextProps: HTMLInputProps /* HTMLInputProps & INumericInputProps */)
    open var renderButtons: Any
    open var renderInput: Any
    open var inputRef: Any
    open var getButtonEventHandlers: Any
    open var handleButtonClick: Any
    open var startContinuousChange: Any
    open var stopContinuousChange: Any
    open var handleContinuousChange: Any
    open var handleInputFocus: Any
    open var handleInputBlur: Any
    open var handleInputKeyDown: Any
    open var handleCompositionEnd: Any
    open var handleCompositionUpdate: Any
    open var handleInputKeyPress: Any
    open var handleInputPaste: Any
    open var handleInputChange: Any
    open var handleNextValue: Any
    open var incrementValue: Any
    open var getIncrementDelta: Any
    open var roundAndClampValue: Any
    open var updateDelta: Any

    companion object {
        var displayName: String
        var VALUE_EMPTY: String
        var VALUE_ZERO: String
        var defaultProps: INumericInputProps
        fun getDerivedStateFromProps(props: INumericInputProps, state: INumericInputState): `T$28`
        var CONTINUOUS_CHANGE_DELAY: Any
        var CONTINUOUS_CHANGE_INTERVAL: Any
        var getStepMaxPrecision: Any
        var roundAndClampValue: Any
    }
}