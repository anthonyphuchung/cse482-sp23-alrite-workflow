package org.openmrs.mobile.activities.dashboard;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.amlcurran.showcaseview.OnShowcaseEventListener;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.ImageUtils;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.databinding.FragmentDashboardBinding;
import org.openmrs.mobile.utilities.ThemeUtils;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\rH\u0002J8\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lorg/openmrs/mobile/activities/dashboard/DashboardFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentDashboardBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentDashboardBinding;", "mBitmapCache", "Landroid/util/SparseArray;", "Landroid/graphics/Bitmap;", "bindDrawableResource", "", "imageView", "Landroid/widget/ImageView;", "drawableId", "", "bindDrawableResources", "changeColorOfDashboardIcons", "createImageBitmap", "key", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "setListeners", "showOverlayTutorial", "view", "title", "", "content", "styleTheme", "currentViewCount", "showTextBelow", "", "unbindDrawableResources", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DashboardFragment extends org.openmrs.mobile.activities.BaseFragment implements android.view.View.OnClickListener {
    private org.openmrs.mobile.databinding.FragmentDashboardBinding _binding;
    private android.util.SparseArray<android.graphics.Bitmap> mBitmapCache;
    public static final org.openmrs.mobile.activities.dashboard.DashboardFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentDashboardBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showOverlayTutorial(int view, java.lang.String title, java.lang.String content, int styleTheme, int currentViewCount, boolean showTextBelow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setListeners() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Binds drawable resources to all dashboard buttons
     */
    public final void bindDrawableResources() {
    }
    
    /**
     * Binds drawable resource to ImageView
     *
     * @param imageView ImageView to bind resource to
     * @param drawableId id of drawable resource (for example R.id.somePicture);
     */
    private final void bindDrawableResource(android.widget.ImageView imageView, int drawableId) {
    }
    
    /**
     * Unbinds drawable resources
     */
    private final void unbindDrawableResources() {
    }
    
    private final void createImageBitmap(int key, android.view.ViewGroup.LayoutParams layoutParams) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void changeColorOfDashboardIcons() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public DashboardFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/dashboard/DashboardFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/dashboard/DashboardFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.dashboard.DashboardFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}