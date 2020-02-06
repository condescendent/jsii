package software.amazon.jsii.tests.calculator;

/**
 * EXPERIMENTAL
 */
@javax.annotation.Generated(value = "jsii-pacmak")
@software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
@software.amazon.jsii.Jsii(module = software.amazon.jsii.tests.calculator.$Module.class, fqn = "jsii-calc.RuntimeTypeChecking")
public class RuntimeTypeChecking extends software.amazon.jsii.JsiiObject {

    protected RuntimeTypeChecking(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RuntimeTypeChecking(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public RuntimeTypeChecking() {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this);
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param arg1
     * @param arg2
     * @param arg3
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithDefaultedArguments(final @org.jetbrains.annotations.Nullable java.lang.Number arg1, final @org.jetbrains.annotations.Nullable java.lang.String arg2, final @org.jetbrains.annotations.Nullable java.time.Instant arg3) {
        this.jsiiCall("methodWithDefaultedArguments", software.amazon.jsii.NativeType.VOID, new Object[] { arg1, arg2, arg3 });
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param arg1
     * @param arg2
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithDefaultedArguments(final @org.jetbrains.annotations.Nullable java.lang.Number arg1, final @org.jetbrains.annotations.Nullable java.lang.String arg2) {
        this.jsiiCall("methodWithDefaultedArguments", software.amazon.jsii.NativeType.VOID, new Object[] { arg1, arg2 });
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param arg1
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithDefaultedArguments(final @org.jetbrains.annotations.Nullable java.lang.Number arg1) {
        this.jsiiCall("methodWithDefaultedArguments", software.amazon.jsii.NativeType.VOID, new Object[] { arg1 });
    }

    /**
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithDefaultedArguments() {
        this.jsiiCall("methodWithDefaultedArguments", software.amazon.jsii.NativeType.VOID);
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param arg
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithOptionalAnyArgument(final @org.jetbrains.annotations.Nullable java.lang.Object arg) {
        this.jsiiCall("methodWithOptionalAnyArgument", software.amazon.jsii.NativeType.VOID, new Object[] { arg });
    }

    /**
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithOptionalAnyArgument() {
        this.jsiiCall("methodWithOptionalAnyArgument", software.amazon.jsii.NativeType.VOID);
    }

    /**
     * Used to verify verification of number of method arguments.
     * <p>
     * EXPERIMENTAL
     * <p>
     * @param arg1 This parameter is required.
     * @param arg2 This parameter is required.
     * @param arg3
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithOptionalArguments(final @org.jetbrains.annotations.NotNull java.lang.Number arg1, final @org.jetbrains.annotations.NotNull java.lang.String arg2, final @org.jetbrains.annotations.Nullable java.time.Instant arg3) {
        this.jsiiCall("methodWithOptionalArguments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(arg1, "arg1 is required"), java.util.Objects.requireNonNull(arg2, "arg2 is required"), arg3 });
    }

    /**
     * Used to verify verification of number of method arguments.
     * <p>
     * EXPERIMENTAL
     * <p>
     * @param arg1 This parameter is required.
     * @param arg2 This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public void methodWithOptionalArguments(final @org.jetbrains.annotations.NotNull java.lang.Number arg1, final @org.jetbrains.annotations.NotNull java.lang.String arg2) {
        this.jsiiCall("methodWithOptionalArguments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(arg1, "arg1 is required"), java.util.Objects.requireNonNull(arg2, "arg2 is required") });
    }
}
