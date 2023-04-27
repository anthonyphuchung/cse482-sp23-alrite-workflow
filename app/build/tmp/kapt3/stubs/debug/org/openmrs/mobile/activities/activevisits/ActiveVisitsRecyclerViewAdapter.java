package org.openmrs.mobile.activities.activevisits;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Visit;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.DateUtils;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.visitdashboard.VisitDashboardActivity;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/openmrs/mobile/activities/activevisits/ActiveVisitsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/openmrs/mobile/activities/activevisits/ActiveVisitsRecyclerViewAdapter$VisitViewHolder;", "mContext", "Landroid/content/Context;", "mVisits", "", "Lcom/openmrs/android_sdk/library/models/Visit;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "visitViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "holder", "VisitViewHolder", "app_debug"})
public final class ActiveVisitsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.openmrs.mobile.activities.activevisits.ActiveVisitsRecyclerViewAdapter.VisitViewHolder> {
    private final android.content.Context mContext = null;
    private final java.util.List<com.openmrs.android_sdk.library.models.Visit> mVisits = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.openmrs.mobile.activities.activevisits.ActiveVisitsRecyclerViewAdapter.VisitViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.activities.activevisits.ActiveVisitsRecyclerViewAdapter.VisitViewHolder visitViewHolder, int position) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.activities.activevisits.ActiveVisitsRecyclerViewAdapter.VisitViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ActiveVisitsRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.util.List<com.openmrs.android_sdk.library.models.Visit> mVisits) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lorg/openmrs/mobile/activities/activevisits/ActiveVisitsRecyclerViewAdapter$VisitViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mConstraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMConstraintLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mDisplayName", "Landroid/widget/TextView;", "getMDisplayName", "()Landroid/widget/TextView;", "mGender", "Landroid/widget/ImageView;", "getMGender", "()Landroid/widget/ImageView;", "mIdentifier", "getMIdentifier", "mStartVisitDate", "getMStartVisitDate", "mVisitPlace", "getMVisitPlace", "clearAnimation", "", "app_debug"})
    public static final class VisitViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mIdentifier = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mDisplayName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mGender = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mStartVisitDate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mVisitPlace = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout mConstraintLayout = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMGender() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMStartVisitDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMVisitPlace() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getMConstraintLayout() {
            return null;
        }
        
        public final void clearAnimation() {
        }
        
        public VisitViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}