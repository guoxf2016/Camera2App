
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -ffast-math -O3 -funroll-loops -Wall -Wextra -Werror")

message("debug PROJECT_SOURCE_DIR  ${PROJECT_SOURCE_DIR}")

add_library(jni_tinyplanet SHARED ${PROJECT_SOURCE_DIR}/src/main/cpp/tinyplanet.cc)

find_library(log-lib log)

#find_library(graphics jnigraphics)

target_link_libraries(jni_tinyplanet ${log-lib} -ljnigraphics)