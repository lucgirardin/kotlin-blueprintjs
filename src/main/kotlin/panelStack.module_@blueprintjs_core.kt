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

external interface IPanelStackProps : IProps {
    var initialPanel: IPanel<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((removedPanel: IPanel__0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpen: ((addedPanel: IPanel__0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var renderActivePanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showPanelHeader: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stack: Array<IPanel<Any>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPanelStackState {
    var direction: String /* "push" | "pop" */
    var stack: Array<IPanel__0>
}

external open class PanelStack(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IPanelStackProps, IPanelStackState> {
    open fun componentDidUpdate(prevProps: IPanelStackProps, prevState: IPanelStackState)
    override fun render(): Element
    override fun validateProps(props: IPanelStackProps)
    open var renderPanels: Any
    open var renderPanel: Any
    open var handlePanelClose: Any
    open var handlePanelOpen: Any
}