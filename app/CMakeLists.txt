
cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_LIBRARY_OUTPUT_DIRECTORY src/main/jniLibs/{ANDROID_ABI})

add_subdirectory(${CMAKE_SOURCE_DIR}/sub_cmake_lists/libjpegutil)
add_subdirectory(sub_cmake_lists/tinyplanet)

