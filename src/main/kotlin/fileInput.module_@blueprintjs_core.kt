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
import React.FormEventHandler
import React.LabelHTMLAttributes
import global.JSX.Element

external interface IFileInputProps : LabelHTMLAttributes<HTMLLabelElement>, IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasSelection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: HTMLProps<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: FormEventHandler<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var text: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var buttonText: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class FileInput(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IFileInputProps> {
    override fun render(): Element
    open var handleInputChange: Any

    companion object {
        var displayName: String
        var defaultProps: IFileInputProps
    }
}