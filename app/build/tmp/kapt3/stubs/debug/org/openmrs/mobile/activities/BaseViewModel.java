package org.openmrs.mobile.activities;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.openmrs.android_sdk.library.models.OperationType;
import com.openmrs.android_sdk.library.models.Result;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004J\b\u0010\u0015\u001a\u00020\u0012H\u0004J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0014\u00a2\u0006\u0002\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0014J\u0012\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0004R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lorg/openmrs/mobile/activities/BaseViewModel;", "T", "Landroidx/lifecycle/ViewModel;", "()V", "_result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/openmrs/android_sdk/library/models/Result;", "get_result", "()Landroidx/lifecycle/MutableLiveData;", "mSubscription", "Lrx/subscriptions/CompositeSubscription;", "getMSubscription", "()Lrx/subscriptions/CompositeSubscription;", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "addSubscription", "", "subscription", "Lrx/Subscription;", "clearSubscriptions", "onCleared", "setContent", "data", "operationType", "Lcom/openmrs/android_sdk/library/models/OperationType;", "(Ljava/lang/Object;Lcom/openmrs/android_sdk/library/models/OperationType;)V", "setError", "t", "", "setLoading", "app_debug"})
public abstract class BaseViewModel<T extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.openmrs.android_sdk.library.models.Result<T>> _result = null;
    @org.jetbrains.annotations.NotNull()
    private final rx.subscriptions.CompositeSubscription mSubscription = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.openmrs.android_sdk.library.models.Result<T>> get_result() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.Result<T>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final rx.subscriptions.CompositeSubscription getMSubscription() {
        return null;
    }
    
    protected final void addSubscription(@org.jetbrains.annotations.NotNull()
    rx.Subscription subscription) {
    }
    
    protected final void clearSubscriptions() {
    }
    
    protected final void setLoading(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.OperationType operationType) {
    }
    
    protected void setContent(T data, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.OperationType operationType) {
    }
    
    protected void setError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable t, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.OperationType operationType) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}