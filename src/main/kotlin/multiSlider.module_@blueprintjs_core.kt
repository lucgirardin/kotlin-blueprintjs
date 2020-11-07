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
import React.FunctionComponent

external interface ISliderBaseProps : IProps, IIntentProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var labelStepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelValues: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var labelPrecision: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showTrackFill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stepSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelRenderer: dynamic /* Boolean? | ((value: Number) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IMultiSliderProps : ISliderBaseProps {
    var defaultTrackIntent: Any?
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((values: Array<Number>) -> Unit)?
    val onRelease: ((values: Array<Number>) -> Unit)?
}

external interface ISliderState {
    var labelPrecision: Number
    var tickSize: Number
    var tickSizeRatio: Number
}

external interface `T$34` {
    var labelPrecision: Number
}

external open class MultiSlider(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IMultiSliderProps, ISliderState> {
    open var handleElements: Any
    open var trackElement: Any
    open fun getSnapshotBeforeUpdate(prevProps: IMultiSliderProps): Nothing?
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IMultiSliderProps, prevState: ISliderState)
    override fun validateProps(props: IMultiSliderProps /* IMultiSliderProps & `T$2` */)
    open var formatLabel: Any
    open var renderLabels: Any
    open var renderTracks: Any
    open var renderTrackFill: Any
    open var renderHandles: Any
    open var addHandleRef: Any
    open var maybeHandleTrackClick: Any
    open var maybeHandleTrackTouch: Any
    open var canHandleTrackEvent: Any
    open var nearestHandleForValue: Any
    open var getHandlerForIndex: Any
    open var getNewHandleValues: Any
    open var findFirstLockedHandleIndex: Any
    open var handleChange: Any
    open var handleRelease: Any
    open var getLabelValues: Any
    open var getOffsetRatio: Any
    open var getTrackIntent: Any
    open var updateTickSize: Any

    companion object {
        var defaultSliderProps: ISliderBaseProps
        var defaultProps: IMultiSliderProps
        var displayName: String
        var Handle: FunctionComponent<IHandleProps>
        fun getDerivedStateFromProps(props: IMultiSliderProps): `T$34`
        var getLabelPrecision: Any
    }
}