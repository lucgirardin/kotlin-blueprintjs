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
import tsstdlib.Partial

external interface IBreadcrumbsProps : IProps {
    var breadcrumbRenderer: ((props: IBreadcrumbProps) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var currentBreadcrumbRenderer: ((props: IBreadcrumbProps) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<IBreadcrumbProps>
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var overflowListProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IBreadcrumbsPropsPartial : IProps {
    var breadcrumbRenderer: ((props: IBreadcrumbProps) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var currentBreadcrumbRenderer: ((props: IBreadcrumbProps) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<IBreadcrumbProps>?
        get() = definedExternally
        set(value) = definedExternally
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var overflowListProps: Partial<IOverflowListProps<IBreadcrumbProps>>?
        get() = definedExternally
        set(value) = definedExternally
    var popoverProps: IPopoverProps?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Breadcrumbs(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IBreadcrumbsProps> {
    override fun render(): Element
    open var renderOverflow: Any
    open var renderOverflowBreadcrumb: Any
    open var renderBreadcrumbWrapper: Any
    open var renderBreadcrumb: Any

    companion object {
        var defaultProps: IBreadcrumbsPropsPartial
    }
}