@file:JsModule("popper.js")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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
import Popper.BaseModifier
import Popper.Offset
import Popper.`T$20`
import tsstdlib.CSSStyleDeclaration
import Popper.Attributes
import Popper.`T$21`
import Popper.Modifiers
import Popper.Data
import tsstdlib.ClientRect
import BaseModifier as _BaseModifier

@JsName("default")
external open class Popper {
    open var options: PopperOptions
    open var popper: Element
    open var reference: dynamic /* Element | ReferenceObject */
    constructor(reference: Element, popper: Element, options: PopperOptions = definedExternally)
    constructor(reference: Element, popper: Element)
    constructor(reference: ReferenceObject, popper: Element, options: PopperOptions = definedExternally)
    constructor(reference: ReferenceObject, popper: Element)
    open fun destroy()
    open fun update()
    open fun scheduleUpdate()
    open fun enableEventListeners()
    open fun disableEventListeners()
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): Any?
        @nativeSetter
        operator fun set(key: String, value: dynamic /* "" | Boolean */)
        @nativeSetter
        operator fun set(key: String, value: String /* "auto-start" | "auto" | "auto-end" | "top-start" | "top" | "top-end" | "right-start" | "right" | "right-end" | "bottom-end" | "bottom" | "bottom-start" | "left-end" | "left" | "left-start" */)
    }
    interface Padding {
        var top: Number?
            get() = definedExternally
            set(value) = definedExternally
        var bottom: Number?
            get() = definedExternally
            set(value) = definedExternally
        var left: Number?
            get() = definedExternally
            set(value) = definedExternally
        var right: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BaseModifier {
        var order: Number?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var fn: ModifierFn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$14` {
        var offset: dynamic /* Number? | String? */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$15` {
        var priority: Array<String? /* "top" | "right" | "bottom" | "left" */>?
            get() = definedExternally
            set(value) = definedExternally
        var padding: dynamic /* Number? | Padding? */
            get() = definedExternally
            set(value) = definedExternally
        var boundariesElement: dynamic /* "scrollParent" | "viewport" | "window" | Element? */
            get() = definedExternally
            set(value) = definedExternally
        var escapeWithReference: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$16` {
        var element: dynamic /* String? | Element? */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$17` {
        var behavior: dynamic /* "flip" | "clockwise" | "counterclockwise" | Array<String /* "top" | "right" | "bottom" | "left" */>? */
            get() = definedExternally
            set(value) = definedExternally
        var padding: dynamic /* Number? | Padding? */
            get() = definedExternally
            set(value) = definedExternally
        var boundariesElement: dynamic /* "scrollParent" | "viewport" | "window" | Element? */
            get() = definedExternally
            set(value) = definedExternally
        var flipVariations: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var flipVariationsByContent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$18` {
        var onLoad: Function<*>?
            get() = definedExternally
            set(value) = definedExternally
        var gpuAcceleration: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$19` {
        var gpuAcceleration: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var x: String? /* "bottom" | "top" */
            get() = definedExternally
            set(value) = definedExternally
        var y: String? /* "left" | "right" */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Modifiers {
        var shift: BaseModifier?
            get() = definedExternally
            set(value) = definedExternally
        var offset: BaseModifier? /* BaseModifier? & `T$14`? */
            get() = definedExternally
            set(value) = definedExternally
        var preventOverflow: BaseModifier? /* BaseModifier? & `T$15`? */
            get() = definedExternally
            set(value) = definedExternally
        var keepTogether: BaseModifier?
            get() = definedExternally
            set(value) = definedExternally
        var arrow: BaseModifier? /* BaseModifier? & `T$16`? */
            get() = definedExternally
            set(value) = definedExternally
        var flip: BaseModifier? /* BaseModifier? & `T$17`? */
            get() = definedExternally
            set(value) = definedExternally
        var inner: BaseModifier?
            get() = definedExternally
            set(value) = definedExternally
        var hide: BaseModifier?
            get() = definedExternally
            set(value) = definedExternally
        var applyStyle: BaseModifier? /* BaseModifier? & `T$18`? */
            get() = definedExternally
            set(value) = definedExternally
        var computeStyle: BaseModifier? /* BaseModifier? & `T$19`? */
            get() = definedExternally
            set(value) = definedExternally
        @nativeGetter
        operator fun get(name: String): BaseModifier? /* BaseModifier? & Record<String, Any>? */
        @nativeSetter
        operator fun set(name: String, value: BaseModifier /* BaseModifier & Record<String, Any> */)
    }
    interface Offset {
        var top: Number
        var left: Number
        var width: Number
        var height: Number
    }
    interface `T$20` {
        var top: Number
        var left: Number
    }
    interface `T$21` {
        var popper: Offset
        var reference: Offset
        var arrow: `T$20`
    }
    interface Data {
        var instance: Popper
        var placement: String /* "auto-start" | "auto" | "auto-end" | "top-start" | "top" | "top-end" | "right-start" | "right" | "right-end" | "bottom-end" | "bottom" | "bottom-start" | "left-end" | "left" | "left-start" */
        var originalPlacement: String /* "auto-start" | "auto" | "auto-end" | "top-start" | "top" | "top-end" | "right-start" | "right" | "right-end" | "bottom-end" | "bottom" | "bottom-start" | "left-end" | "left" | "left-start" */
        var flipped: Boolean
        var hide: Boolean
        var arrowElement: Element
        var styles: CSSStyleDeclaration
        var arrowStyles: CSSStyleDeclaration
        var attributes: Attributes
        var boundaries: Any
        var offsets: `T$21`
    }
    interface PopperOptions {
        var placement: String? /* "auto-start" | "auto" | "auto-end" | "top-start" | "top" | "top-end" | "right-start" | "right" | "right-end" | "bottom-end" | "bottom" | "bottom-start" | "left-end" | "left" | "left-start" */
            get() = definedExternally
            set(value) = definedExternally
        var positionFixed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var eventsEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var modifiers: Modifiers?
            get() = definedExternally
            set(value) = definedExternally
        var removeOnDestroy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        val onCreate: ((data: Data) -> Unit)?
        val onUpdate: ((data: Data) -> Unit)?
    }
    interface ReferenceObject {
        var clientHeight: Number
        var clientWidth: Number
        var referenceNode: Node?
            get() = definedExternally
            set(value) = definedExternally
        fun getBoundingClientRect(): ClientRect
    }

    companion object {
        var modifiers: Array<_BaseModifier /* BaseModifier & `T$22` */>
        var placements: Array<Placement>
        var Defaults: PopperOptions
    }
}