#include <iostream>
#include <fstream>
#include <array>
#include <string>
#include <vector>
#include <string.h>
#include <regex>
using namespace std;

int main(void)
{
  ifstream data;
  data.open("input.txt");
  char const *digits = "0123456789";
  string spelled_digits[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  int final_val = 0;
  int ind;
  while (data)
  {
    ind += 1;
    if (ind > 1000)
    {
      break;
    }
    string data_proc;
    string holder = "";
    string final_sender = "";
    getline(data, data_proc);
    holder = data_proc;
    int index;
    for (int x = 0; x < 9; x++)
    {
      while ((index = data_proc.find(spelled_digits[x])) != string::npos)
      {
        data_proc.replace(index + 1, spelled_digits[x].length() - 2, to_string((x + 1)));
      }
    }
    try
    {
      data_proc = regex_replace(data_proc, regex(R"([\D])"), "");
      final_sender += data_proc[0];
      final_sender += data_proc.back();
      final_val += stoi(final_sender);
    }
    catch (const invalid_argument &e)
    {
      cout << "wtf"
           << "\n";
    }
    catch (const out_of_range &e)
    {
      cout << "wtf"
           << "\n";
    }
  }
  cout << final_val << "\n";
}
