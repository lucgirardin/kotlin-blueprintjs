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
import React.Component__1

external interface ICollapsibleListProps : IProps {
    var dropdownTarget: Element
    var dropdownProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: (props: IMenuItemProps, index: Number) -> Element
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICollapsibleListPropsPartial : IProps {
    var dropdownTarget: Element?
        get() = definedExternally
        set(value) = definedExternally
    var dropdownProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: ((props: IMenuItemProps, index: Number) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CollapsibleList : Component__1<ICollapsibleListProps> {
    override fun render(): Element
    open var partitionChildren: Any

    companion object {
        var displayName: String
        var defaultProps: ICollapsibleListPropsPartial
    }
}