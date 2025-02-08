package com.rxmobileteam.lecture11

import com.rxmobileteam.utils.ExerciseNotCompletedException
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Scheduler

object Riddle34 {
  /**
   * Shift all downstream and upstream work of [source] to the given [scheduler].
   *
   * Use case: You want to shift work to a particular [Scheduler].
   */
  fun solve(source: Completable, scheduler: Scheduler): Completable {
    return source.subscribeOn(scheduler)
  }
}
