
// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("core");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("core")
//      }
//    }
#include <jni.h>
#include <string>

extern "C" {
#include "include/libavcodec/avcodec.h"
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_panda_core_Test_getFFmpegInfo(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(avcodec_configuration());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_panda_core_Test_getString(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("Hello from C++");
}