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
import React.SyntheticEvent__1
import React.HTMLProps
import global.JSX.Element

external interface IOverlayableProps : IOverlayLifecycleProps {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEscapeKeyClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enforceFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lazy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var portalClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var portalContainer: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((event: SyntheticEvent__1<HTMLElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayLifecycleProps {
    var onClosing: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onClosed: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpening: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpened: ((node: HTMLElement) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBackdropProps {
    var backdropClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var backdropProps: HTMLProps<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    var canOutsideClickClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayProps : IOverlayableProps, IBackdropProps, IProps {
    var isOpen: Boolean
    var transitionName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverlayState {
    var hasEverOpened: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$13` {
    var hasEverOpened: Boolean
}

external open class Overlay(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IOverlayProps, IOverlayState> {
    open var containerElement: HTMLElement?
    open var refHandlers: Any
    override fun render(): Element?
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IOverlayProps)
    override var componentWillUnmount: () -> Unit
    open var maybeRenderChild: Any
    open var maybeRenderBackdrop: Any
    open var overlayWillClose: Any
    open var overlayWillOpen: Any
    open var handleBackdropMouseDown: Any
    open var handleDocumentClick: Any
    open var handleDocumentFocus: Any
    open var handleKeyDown: Any
    open var handleTransitionAddEnd: Any

    companion object {
        var displayName: String
        var defaultProps: IOverlayProps
        fun getDerivedStateFromProps(__0: IOverlayProps): `T$13`?
        var openStack: Any
        var getLastOpened: Any
    }
}