
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -ffast-math -O3 -funroll-loops -Wall -Wextra -Werror")

add_library(jpeg_static_ndk STATIC IMPORTED)

set_target_properties(jpeg_static_ndk
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libjpeg_static_ndk.a
)

add_library(jni_jpegutil SHARED ${PROJECT_SOURCE_DIR}/src/main/cpp/jpegutil.cpp
                ${PROJECT_SOURCE_DIR}/src/main/cpp/jpegutilnative.cpp)

find_library(log-lib log)

#find_library(graphics jnigraphics)

target_link_libraries(jni_jpegutil jpeg_static_ndk ${log-lib} -ldl -ljnigraphics)