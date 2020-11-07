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
import tsstdlib.AnimationEvent
import tsstdlib.ClipboardEvent
import tsstdlib.PointerEvent
import tsstdlib.TransitionEvent

typealias NativeAnimationEvent = AnimationEvent

typealias NativeClipboardEvent = ClipboardEvent

typealias NativeCompositionEvent = CompositionEvent

typealias NativeDragEvent = DragEvent

typealias NativeFocusEvent = FocusEvent

typealias NativeKeyboardEvent = KeyboardEvent

typealias NativeMouseEvent = MouseEvent

typealias NativeTouchEvent = TouchEvent

typealias NativePointerEvent = PointerEvent

typealias NativeTransitionEvent = TransitionEvent

typealias NativeUIEvent = UIEvent

typealias NativeWheelEvent = WheelEvent

external interface SchedulerInteraction {
    var id: Number
    var name: String
    var timestamp: Number
}

typealias IsExactlyAny<T> = Any

typealias NotExactlyAnyPropertyKeys<T> = Any

typealias MergePropTypes<P, T> = Any

typealias Defaultize<P, D> = Any

typealias ReactManagedAttributes<C, P> = Any