package com.rxmobileteam.lecture11

import com.rxmobileteam.utils.ExerciseNotCompletedException
import io.reactivex.rxjava3.core.Observable

object Riddle18 {
  /**
   * Return an Observable that mirrors either the [first] or [second] Observable depending on whoever emits or terminates first.
   *
   * Use case: You have multiple sources and want to get the data from either one and then be consistent and not switch between multiple sources.
   */
  fun solve(first: Observable<Int>, second: Observable<Int>): Observable<Int> {
    return Observable.amb(listOf(first, second))
  }
}
