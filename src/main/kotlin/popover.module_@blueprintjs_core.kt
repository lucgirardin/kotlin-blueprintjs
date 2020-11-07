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
import React.HTMLProps
import global.JSX.Element

external object PopoverInteractionKind {
    var CLICK: String /* "click" */
    var CLICK_TARGET_ONLY: String /* "click-target" */
    var HOVER: String /* "hover" */
    var HOVER_TARGET_ONLY: String /* "hover-target" */
}

external interface IPopoverProps : IPopoverSharedProps {
    var backdropProps: HTMLProps<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any
        get() = definedExternally
        set(value) = definedExternally
    var hasBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var popoverRef: ((ref: HTMLElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var target: dynamic /* String? | JSX.Element? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPopoverState {
    var transformOrigin: String
    var isOpen: Boolean
    var hasDarkParent: Boolean
}

external open class Popover(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IPopoverProps, IPopoverState> {
    open var popoverRef: Any
    open var popoverElement: HTMLElement?
    open var targetElement: HTMLElement?
    open var cancelOpenTimeout: Any
    open var isMouseInTargetOrPopover: Any
    open var lostFocusOnSamePage: Any
    open var popperScheduleUpdate: Any
    open var refHandlers: Any
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(props: IPopoverProps, state: IPopoverState)
    open var reposition: () -> Unit?
    override fun validateProps(props: IPopoverProps /* IPopoverProps & `T$0` */)
    open var updateDarkParent: Any
    open var renderPopover: Any
    open var renderTarget: Any
    open var understandChildren: Any
    open var isControlled: Any
    open var getIsOpen: Any
    open var getPopperModifiers: Any
    open var handleTargetFocus: Any
    open var handleTargetBlur: Any
    open var handleMouseEnter: Any
    open var handleMouseLeave: Any
    open var handlePopoverClick: Any
    open var handleOverlayClose: Any
    open var handleTargetClick: Any
    open var setOpenState: Any
    open var isArrowEnabled: Any
    open var isElementInPopover: Any
    open var isHoverInteractionKind: Any
    open var updatePopoverState: Any

    companion object {
        var displayName: String
        var defaultProps: IPopoverProps
    }
}