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
import React.TableHTMLAttributes
import global.JSX.Element

external interface IHTMLTableProps : TableHTMLAttributes<HTMLTableElement>, IElementRefProps<HTMLTableElement> {
    var bordered: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var condensed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interactive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var striped: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class HTMLTable(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IHTMLTableProps> {
    override fun render(): Element
}