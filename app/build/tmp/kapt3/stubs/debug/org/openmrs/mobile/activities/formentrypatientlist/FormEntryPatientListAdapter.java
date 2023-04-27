package org.openmrs.mobile.activities.formentrypatientlist;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.formlist.FormListActivity;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListAdapter$PatientViewHolder;", "mContext", "Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListFragment;", "mItems", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "(Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListFragment;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "updateList", "patients", "PatientViewHolder", "app_debug"})
public final class FormEntryPatientListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListAdapter.PatientViewHolder> {
    private final org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListFragment mContext = null;
    private java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> mItems;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListAdapter.PatientViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListAdapter.PatientViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListAdapter.PatientViewHolder holder) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patients) {
    }
    
    public FormEntryPatientListAdapter(@org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListFragment mContext, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> mItems) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListAdapter$PatientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDisplayName", "Landroid/widget/TextView;", "getMDisplayName", "()Landroid/widget/TextView;", "mGender", "Landroid/widget/ImageView;", "getMGender", "()Landroid/widget/ImageView;", "mIdentifier", "getMIdentifier", "mRowLayout", "Landroidx/cardview/widget/CardView;", "getMRowLayout", "()Landroidx/cardview/widget/CardView;", "mVisitStatus", "getMVisitStatus", "clearAnimation", "", "app_debug"})
    public static final class PatientViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView mRowLayout = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mIdentifier = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mDisplayName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView mGender = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mVisitStatus = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getMRowLayout() {
            return null;
        }
        
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
        public final android.widget.TextView getMVisitStatus() {
            return null;
        }
        
        public final void clearAnimation() {
        }
        
        public PatientViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}