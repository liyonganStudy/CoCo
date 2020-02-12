package com.qw.photo.annotations

import androidx.annotation.IntDef
import com.qw.photo.pojo.PickParams.Companion.PICK_CONTENT
import com.qw.photo.pojo.PickParams.Companion.PICK_DICM
import com.qw.photo.pojo.TakeParams.Companion.BACK
import com.qw.photo.pojo.TakeParams.Companion.FRONT


/**
 *
 * @author cd5160866
 */

@IntDef(FRONT, BACK)
@Retention(AnnotationRetention.SOURCE)
annotation class CameraFace

@IntDef(PICK_CONTENT, PICK_DICM)
@Retention(AnnotationRetention.SOURCE)
annotation class PickRange